package com.example.studentmarket.adapters

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.studentmarket.R
import com.example.studentmarket.core.models.Product
import kotlinx.android.synthetic.main.widget_product_card.view.*


class CardAdapter( val products: List<Product>) :
    RecyclerView.Adapter<CardAdapter.ViewHolder>() {


    /**
     * Inflates the item views in the designated xml layout file
     * create a new ViewHolder and initializes some private fields to be used by RecyclerView.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.widget_product_card, parent,false)
        )
    }

    /**
     * Binds each item in the ArrayList to a view.
     * Called when RecyclerView needs a new ViewHolder of the given type to represent an item.
     */
    override fun onBindViewHolder(holder: CardAdapter.ViewHolder, position: Int) {
        holder.bindItems(products[position])
        //val item_position = items.get(position)
//        holder.ivProductImage.tools.srcCompat = "@tools:sample/backgrounds/scenic"
        /*holder.ivProductImage.setImageResource(R.drawable.icon_student_market)
        holder.tvProductName.text = "Product number: $item_position"
        holder.tvProductPrice.text = "R 1$item_position.99"
        holder.tvRating.text = "4.9 ($item_position)"
        holder.tvLocation.text = "1.$item_position km"
        holder.tvSaved.text = "Save" //TODO: Function to check if saved to determine text*/
//        holder.bViewStore.OnClick = "Not sure how this section will work yet"
//        holder.bViewProduct.OnClick = "Not sure how this section will work yet"
    }

    override fun getItemCount(): Int {
        return products.size
    }

    /**
     * A ViewHolder describes an item view and metadata about it's place within the RecyclerView.
     */
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
       /* //Holds the data needed for each item
        val tvProductName = view.text_view_product_name
        val ivProductImage = view.image_view_product_image //srcCompat="@tools:sample/backgrounds/scenic"
        val tvProductPrice = view.text_view_product_price

        //        val ivRating = view.image_view_rating
        val tvRating = view.text_view_rating
        val tvLocation = view.text_view_location
        //        val ivSaved = view.image_view_saved
        val tvSaved = view.text_view_saved

        val bViewStore = view.button_view_store
        val bViewProduct = view.button_view_product*/

        //bind items functions takes the database given by the database for a specific product and binds to the product card
        fun bindItems(product: Product){
            //initialize all the items/views in the card
            val productNameText = itemView.findViewById(R.id.text_view_product_name) as TextView
            val priceText = itemView.findViewById(R.id.text_view_product_price) as TextView
            val productImage = itemView.findViewById(R.id.image_view_product_image) as ImageView
            val productRating = itemView.findViewById(R.id.text_view_rating) as TextView
            val productRange = itemView.findViewById(R.id.text_view_location) as TextView

            val viewStore = itemView.findViewById(R.id.button_view_store) as Button
            val viewProduct = itemView.findViewById(R.id.button_view_product) as Button
            //TODO implement save button

            //set the cardvalues to the data received from the database
            productNameText.text = product.prodName
            priceText.text = product.prodPrice.toString()
            //productImage.setImageDrawable(product.prodImage) TODO implement displaying images
            productRating.text = product.prodRating.toString()
            productRange.text = product.prodRange.toString()

            //TODO implement on Click functions for the buttons

        }
    }
}
