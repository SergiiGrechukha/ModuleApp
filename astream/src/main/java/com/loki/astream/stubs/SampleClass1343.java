package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1343 {

    @Ignore    private SampleClass1344 sampleClass;

    public SampleClass1343(){
        sampleClass = new SampleClass1344();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}