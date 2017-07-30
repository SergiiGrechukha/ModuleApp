package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1306 {

    @Ignore    private SampleClass1307 sampleClass;

    public SampleClass1306(){
        sampleClass = new SampleClass1307();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}