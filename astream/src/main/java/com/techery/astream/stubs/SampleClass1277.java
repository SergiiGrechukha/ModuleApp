package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1277 {

    @Ignore    private SampleClass1278 sampleClass;

    public SampleClass1277(){
        sampleClass = new SampleClass1278();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}