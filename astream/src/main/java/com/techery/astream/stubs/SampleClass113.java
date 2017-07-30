package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass113 {

    @Ignore    private SampleClass114 sampleClass;

    public SampleClass113(){
        sampleClass = new SampleClass114();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}