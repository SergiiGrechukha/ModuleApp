package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass205 {

    @Ignore    private SampleClass206 sampleClass;

    public SampleClass205(){
        sampleClass = new SampleClass206();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}