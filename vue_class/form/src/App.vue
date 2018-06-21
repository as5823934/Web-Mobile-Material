<template>
<div class="container">
  <form>
    <div class="row">
      <div class="col-xs-12 col-sm-8 col-sm-offest-2 col-md-6 col-md-offest-3">
        <h1>File a Complaint</h1>
        <hr>
        <div class="form-group">
          <label from="email">Mail</label>
          <input
              type="text"
              id="email"
              value="">
        </div>
      </div>
    </div>
  </form>
</div>
  
</template>

<script>

import Switch from './Switch.vue'

export default {
  
  data () {
    return {
      userDate:{
        email:"",
        id:"",
      }
      
    }
  }
}
</script>

<style>

</style>
