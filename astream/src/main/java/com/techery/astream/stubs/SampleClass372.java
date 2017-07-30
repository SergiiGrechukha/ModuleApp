package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass372 {

    @Ignore    private SampleClass373 sampleClass;

    public SampleClass372(){
        sampleClass = new SampleClass373();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}