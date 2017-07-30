package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass169 {

    @Ignore    private SampleClass170 sampleClass;

    public SampleClass169(){
        sampleClass = new SampleClass170();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}