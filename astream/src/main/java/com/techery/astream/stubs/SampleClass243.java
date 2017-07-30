package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass243 {

    @Ignore    private SampleClass244 sampleClass;

    public SampleClass243(){
        sampleClass = new SampleClass244();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}