package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass767 {

    @Ignore    private SampleClass768 sampleClass;

    public SampleClass767(){
        sampleClass = new SampleClass768();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}