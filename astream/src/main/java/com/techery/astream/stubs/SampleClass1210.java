package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1210 {

    @Ignore    private SampleClass1211 sampleClass;

    public SampleClass1210(){
        sampleClass = new SampleClass1211();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}