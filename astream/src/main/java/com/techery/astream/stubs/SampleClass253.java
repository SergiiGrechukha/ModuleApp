package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass253 {

    @Ignore    private SampleClass254 sampleClass;

    public SampleClass253(){
        sampleClass = new SampleClass254();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}