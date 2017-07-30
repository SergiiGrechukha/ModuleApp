package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1136 {

    @Ignore    private SampleClass1137 sampleClass;

    public SampleClass1136(){
        sampleClass = new SampleClass1137();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}