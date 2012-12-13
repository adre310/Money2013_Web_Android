/*
* Localization module
*/
Translation = {
		setData: function(data) {
			console.log('Translation.setDate');
			this.items=data;
		},
		get: function(id) {
			//console.log('Translation.get('+id+') = '+this.items[id]);
			if(this.items) {
				return this.items[id];
			} else {
				console.log('ERROR - Translation.get('+id+')');
				return '';
			}
		}
	};
