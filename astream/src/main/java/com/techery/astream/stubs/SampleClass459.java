package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass459 {

    @Ignore    private SampleClass460 sampleClass;

    public SampleClass459(){
        sampleClass = new SampleClass460();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}