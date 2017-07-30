package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass817 {

    @Ignore    private SampleClass818 sampleClass;

    public SampleClass817(){
        sampleClass = new SampleClass818();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}