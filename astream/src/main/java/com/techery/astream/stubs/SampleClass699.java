package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass699 {

    @Ignore    private SampleClass700 sampleClass;

    public SampleClass699(){
        sampleClass = new SampleClass700();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}