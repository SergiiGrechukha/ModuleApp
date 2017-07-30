package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass128 {

    @Ignore    private SampleClass129 sampleClass;

    public SampleClass128(){
        sampleClass = new SampleClass129();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}