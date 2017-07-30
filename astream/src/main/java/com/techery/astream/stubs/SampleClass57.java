package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass57 {

    @Ignore    private SampleClass58 sampleClass;

    public SampleClass57(){
        sampleClass = new SampleClass58();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}