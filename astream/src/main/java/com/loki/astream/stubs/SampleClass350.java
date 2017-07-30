package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass350 {

    @Ignore    private SampleClass351 sampleClass;

    public SampleClass350(){
        sampleClass = new SampleClass351();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}