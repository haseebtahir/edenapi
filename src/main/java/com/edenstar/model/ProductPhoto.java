package com.edenstar.model;

import java.util.Arrays;

import javax.persistence.Embeddable;

@Embeddable
public class ProductPhoto {

	private int productPhotoId;
	private int productID;
	private String description;
	private byte[] productPhoto;

	public ProductPhoto() {
		super();
	}

	public ProductPhoto(int productPhotoId, int productID, String description, byte[] productPhoto) {
		super();
		this.productPhotoId = productPhotoId;
		this.productID = productID;
		this.description = description;
		this.productPhoto = productPhoto;
	}

	public int getProductPhotoId() {
		return productPhotoId;
	}

	public void setProductPhotoId(int productPhotoId) {
		this.productPhotoId = productPhotoId;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getProductPhoto() {
		return productPhoto;
	}

	public void setProductPhoto(byte[] productPhoto) {
		this.productPhoto = productPhoto;
	}

	@Override
	public String toString() {
		return "ProductPhoto [productPhotoId=" + productPhotoId + ", productID=" + productID + ", description="
				+ description + ", productPhoto=" + Arrays.toString(productPhoto) + "]";
	}

}