package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass187 {

    @Ignore    private SampleClass188 sampleClass;

    public SampleClass187(){
        sampleClass = new SampleClass188();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}