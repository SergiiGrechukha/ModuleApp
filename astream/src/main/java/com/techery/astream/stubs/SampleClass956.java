package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass956 {

    @Ignore    private SampleClass957 sampleClass;

    public SampleClass956(){
        sampleClass = new SampleClass957();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}