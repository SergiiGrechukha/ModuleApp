package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass492 {

    @Ignore    private SampleClass493 sampleClass;

    public SampleClass492(){
        sampleClass = new SampleClass493();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}