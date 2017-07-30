package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass80 {

    @Ignore    private SampleClass81 sampleClass;

    public SampleClass80(){
        sampleClass = new SampleClass81();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}