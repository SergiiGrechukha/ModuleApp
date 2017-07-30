package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1208 {

    @Ignore    private SampleClass1209 sampleClass;

    public SampleClass1208(){
        sampleClass = new SampleClass1209();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}