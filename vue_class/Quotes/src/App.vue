<template>
  <div class="container">
    <div class="row">
      <dp-header v-bind:quoteCount="quotes.length" v-bind:maxQuote="maxQuotes"></dp-header>
      <!-- pass quoteCount and maxQuote to child header.vue -->
    </div>

    <div class="row">
      <dp-add-quote @quoteAdded="addNewQuote"></dp-add-quote>
    </div>

    <div class="row">
      <dp-quote-gird v-bind:quotes="quotes" @quoteDeleted="deleteQuote"></dp-quote-gird>
    </div>

    <div class="row">
      <div class="col-sm-12 text-center">
        <div class="alert alert-info">Info: Click on a Quote to delete it!</div>
      </div>
    </div>
    
  </div>

</template>

<script>

import Header from './components/Header.vue'
import AddQuote from './components/AddQuote.vue'
import QuoteGird from './components/QuoteGrid.vue'
import Quote from './components/Quote.vue'

export default {
  components: {
    'dp-header': Header,
    'dp-add-quote': AddQuote,
    'dp-quote-gird': QuoteGird,
    'dp-quote': Quote,
  },

  data () {
    return {
      quotes:[],
      maxQuotes: 20,
    }
  },
  methods:{
    addNewQuote(msg){
      if(this.quotes.length >= this.maxQuotes){
        return alert("Please delete quote first")
      }
      this.quotes.push(msg);
      
      
    },
    deleteQuote(index){
      this.quotes.splice(index, 1);
    }
  }
}
</script>

<style>

</style>
