package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1770 {

    @Ignore    private SampleClass1771 sampleClass;

    public SampleClass1770(){
        sampleClass = new SampleClass1771();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}