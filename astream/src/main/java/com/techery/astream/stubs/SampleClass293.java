package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass293 {

    @Ignore    private SampleClass294 sampleClass;

    public SampleClass293(){
        sampleClass = new SampleClass294();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}