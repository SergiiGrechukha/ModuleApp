package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1982 {

    @Ignore    private SampleClass1983 sampleClass;

    public SampleClass1982(){
        sampleClass = new SampleClass1983();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}