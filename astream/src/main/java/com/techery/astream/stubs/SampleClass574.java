package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass574 {

    @Ignore    private SampleClass575 sampleClass;

    public SampleClass574(){
        sampleClass = new SampleClass575();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}