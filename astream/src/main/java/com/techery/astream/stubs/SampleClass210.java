package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass210 {

    @Ignore    private SampleClass211 sampleClass;

    public SampleClass210(){
        sampleClass = new SampleClass211();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}