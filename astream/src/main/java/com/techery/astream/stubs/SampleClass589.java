package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass589 {

    @Ignore    private SampleClass590 sampleClass;

    public SampleClass589(){
        sampleClass = new SampleClass590();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}