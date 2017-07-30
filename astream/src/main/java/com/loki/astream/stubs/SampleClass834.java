package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass834 {

    @Ignore    private SampleClass835 sampleClass;

    public SampleClass834(){
        sampleClass = new SampleClass835();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}