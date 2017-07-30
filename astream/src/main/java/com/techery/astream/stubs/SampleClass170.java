package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass170 {

    @Ignore    private SampleClass171 sampleClass;

    public SampleClass170(){
        sampleClass = new SampleClass171();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}