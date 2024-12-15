package com.pranay.dreamshops.controller;

import com.pranay.dreamshops.exceptions.ResourceNotFoundException;
import com.pranay.dreamshops.model.Cart;
import com.pranay.dreamshops.model.User;
import com.pranay.dreamshops.response.ApiResponse;
import com.pranay.dreamshops.services.cart.ICartItemService;
import com.pranay.dreamshops.services.cart.ICartService;
import com.pranay.dreamshops.services.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/cartItems")
public class CartItemController {

    private final ICartItemService cartItemService;
    private final ICartService cartService;
    private final IUserService userService;


    @PostMapping("/item/add")
    public ResponseEntity<ApiResponse> addItemToCart(@RequestParam Long productId, @RequestParam int quantity) {
        try {
            User user = userService.getUserbyId(3L);
            Cart cart = cartService.initializeNewCart(user);

            cartItemService.addItemToCart(cart.getId(), productId, quantity);
            return ResponseEntity.ok(new ApiResponse("Item added successfully", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @DeleteMapping("/{cartId}/item/{productId}/remove")
    public ResponseEntity<ApiResponse> removeItemFromCart(@PathVariable Long cartId, @PathVariable Long productId) {
        try {
            cartItemService.removeItemFromCart(cartId, productId);
            return ResponseEntity.ok(new ApiResponse("Remove item success", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }

    }

    @PutMapping("/cart/{cartId}/items/{productId}/update")
    public ResponseEntity<ApiResponse> updateItemQuantity(@PathVariable Long cartId, @PathVariable Long productId, @RequestParam int quantity) {
        try {
            cartItemService.updateItemQuantity(cartId, productId, quantity);
            return ResponseEntity.ok(new ApiResponse("Update items success", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }
}
