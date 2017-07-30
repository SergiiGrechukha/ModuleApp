package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass136 {

    @Ignore    private SampleClass137 sampleClass;

    public SampleClass136(){
        sampleClass = new SampleClass137();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}