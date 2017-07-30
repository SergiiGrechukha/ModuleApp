package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1263 {

    @Ignore    private SampleClass1264 sampleClass;

    public SampleClass1263(){
        sampleClass = new SampleClass1264();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}