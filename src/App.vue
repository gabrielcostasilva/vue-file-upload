<template>
  <h1>File Upload</h1>
  
  <input name="file" type="file" @change="onSelectedFile" />
  <button @click="onUpload">Upload</button>
  
</template>

<script>

export default {
  data() {
    return {
      selectedFile: null
    }
  },
  methods: {
    onSelectedFile(event) {
      this.selectedFile = event.target.files[0]
    },
    onUpload() {
      const formData = new FormData();

      formData.append('file', this.selectedFile)
      
      fetch('http://localhost:8080/fileUpload', {
        method: 'POST',
        body: formData
      }).then(data => console.log('File uploaded successfully!'))
      .catch(error => console.log(error))
    }
  },
}
</script>


