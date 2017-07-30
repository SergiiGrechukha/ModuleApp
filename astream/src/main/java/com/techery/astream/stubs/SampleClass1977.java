package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1977 {

    @Ignore    private SampleClass1978 sampleClass;

    public SampleClass1977(){
        sampleClass = new SampleClass1978();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}