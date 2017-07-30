package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1004 {

    @Ignore    private SampleClass1005 sampleClass;

    public SampleClass1004(){
        sampleClass = new SampleClass1005();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}