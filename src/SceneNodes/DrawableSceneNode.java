// This file is part of RogueGL game project
// Copyright (C) 2019 Marek Zalewski aka Drwalin aka DrwalinPCF

package SceneNodes;

import org.joml.*;

import Models.TexturedModel;
import RenderEngine.MasterRenderer;

public class DrawableSceneNode extends SceneNode
{
	private TexturedModel model;
	private MasterRenderer renderer;

	public DrawableSceneNode( MasterRenderer renderer, TexturedModel model, Vector3f location, Vector3f rotation, Vector3f scale )
	{
		super( location, rotation, scale );
		this.model = model;
		this.renderer = renderer;
	}

	public DrawableSceneNode( MasterRenderer renderer, TexturedModel model, Vector3f location, Vector3f rotation )
	{
		super( location, rotation );
		this.model = model;
		this.renderer = renderer;
	}

	public DrawableSceneNode( MasterRenderer renderer, TexturedModel model, Vector3f location )
	{
		super( location );
		this.model = model;
		this.renderer = renderer;
	}

	public TexturedModel GetModel()
	{
		return this.model;
	}

	public void SetModel( TexturedModel model )
	{
		this.model = model;
		this.renderer.AddSceneNode( this );
	}

}
