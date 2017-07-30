package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass52 {

    @Ignore    private SampleClass53 sampleClass;

    public SampleClass52(){
        sampleClass = new SampleClass53();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}