package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1254 {

    @Ignore    private SampleClass1255 sampleClass;

    public SampleClass1254(){
        sampleClass = new SampleClass1255();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}