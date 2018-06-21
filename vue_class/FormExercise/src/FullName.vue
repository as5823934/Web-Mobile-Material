<template>
    <div>
       <div class="form-group">
            <label for="firstname">First Name</label>
            <input type="text" id="firstname" class="form-control" placeholder="First Name" :value="firstname" @input="inputChanged(true, $event)">
        </div>
        <div class="form-group">
            <label for="lastname">Last Name</label>
            <input type="text" id="lastname" class="form-control" placeholder="Last Name" :value="lastname" @input="inputChanged(false, $event)"> 
        </div>
    </div>
</template>

<script>
export default {
  props: ["value"],
  data(){
      return {
         
      };
  },

  methods:{
     inputChanged(isFirst, event){
         let full = "";
         if(isFirst){
             full = event.target.value + " " + this.lastname;
         }else{
             full = this.firstname + " " + event.target.value;
         }
         this.value=full;
         this.$emit("input", this.value)
     }
  },

  computed: {
      firstname(){
          return this.value.split(" ")[0];
      },
      lastname(){
          return this.value.split(" ")[1];
      },
  }
}
</script>
