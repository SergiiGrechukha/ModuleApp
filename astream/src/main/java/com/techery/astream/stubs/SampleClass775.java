package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass775 {

    @Ignore    private SampleClass776 sampleClass;

    public SampleClass775(){
        sampleClass = new SampleClass776();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}