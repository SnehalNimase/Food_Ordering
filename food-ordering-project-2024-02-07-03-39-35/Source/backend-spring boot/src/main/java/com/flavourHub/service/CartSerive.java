package com.flavourHub.service;

import com.flavourHub.Exception.CartException;
import com.flavourHub.Exception.CartItemException;
import com.flavourHub.Exception.FoodException;
import com.flavourHub.Exception.UserException;
import com.flavourHub.model.Cart;
import com.flavourHub.model.CartItem;
import com.flavourHub.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
