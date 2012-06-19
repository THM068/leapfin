class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller: 'home', action: 'index')

		name contact: "/parties"(controller: 'contact', action: 'list')

		name company:"/company/new"(controller: 'company', action: 'create')

		"500"(view:'/error')
	}
}
