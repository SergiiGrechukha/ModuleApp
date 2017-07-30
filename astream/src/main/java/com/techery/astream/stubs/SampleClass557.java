package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass557 {

    @Ignore    private SampleClass558 sampleClass;

    public SampleClass557(){
        sampleClass = new SampleClass558();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}