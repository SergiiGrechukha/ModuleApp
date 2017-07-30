package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1807 {

    @Ignore    private SampleClass1808 sampleClass;

    public SampleClass1807(){
        sampleClass = new SampleClass1808();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}