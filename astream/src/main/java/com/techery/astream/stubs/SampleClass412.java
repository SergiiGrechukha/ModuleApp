package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass412 {

    @Ignore    private SampleClass413 sampleClass;

    public SampleClass412(){
        sampleClass = new SampleClass413();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}