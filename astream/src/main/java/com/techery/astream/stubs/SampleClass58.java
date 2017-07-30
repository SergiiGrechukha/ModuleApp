package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass58 {

    @Ignore    private SampleClass59 sampleClass;

    public SampleClass58(){
        sampleClass = new SampleClass59();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}