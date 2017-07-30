package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass945 {

    @Ignore    private SampleClass946 sampleClass;

    public SampleClass945(){
        sampleClass = new SampleClass946();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}